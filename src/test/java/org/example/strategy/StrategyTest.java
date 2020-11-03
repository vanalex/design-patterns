package org.example.strategy;

import org.example.strategy.duck.*;
import org.example.strategy.string.CommaSplitter;
import org.example.strategy.string.SplitterStrategy;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StrategyTest {

    @Test
    public void test(){
        MallardDuck mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();

        ModelDuck model = new ModelDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    @Test
    public void testGivenStringAsNullWhenSplittingThenThrowsException(){
        String s = null;
        SplitterStrategy splitter = new CommaSplitter();
        assertThatThrownBy(() -> splitter.split(null))
        .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void testGivenStringWithNoCommaSeparatorWhenSplittingThenResultShouldBeOne(){
        SplitterStrategy splitter = new CommaSplitter();
        String[] result = splitter.split("aa");
        assertThat(result.length).isEqualTo(1);
    }

    @Test
    public void testGivenStringWithCommaSeparatorWhenSplittingThenResultShouldBeMoreThanOne(){
        SplitterStrategy splitter = new CommaSplitter();
        String[] result = splitter.split("a,a");
        assertThat(result.length).isEqualTo(2);
    }

    @Test
    public void testGivenStringWithSpaceWithCommaSeparatorWhenSplittingThenResultShouldBeOne(){
        SplitterStrategy splitter = new CommaSplitter();
        String[] result = splitter.split("a a");
        assertThat(result.length).isEqualTo(1);
    }

    @Test
    public void testGivenStringasBlankWithCommaSeparatorWhenSplittingThenResultShouldBeOne(){
        SplitterStrategy splitter = new CommaSplitter();
        String[] result = splitter.split("");
        assertThat(result.length).isEqualTo(1);
    }
}
