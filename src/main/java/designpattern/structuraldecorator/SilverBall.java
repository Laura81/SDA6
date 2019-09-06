package designpattern.structuraldecorator;

public class SilverBall extends TreeDecorator {

    public SilverBall(ChristmasTree decoratedChristmasTree) {
        super(decoratedChristmasTree);
    }

    @Override
    public String decorate(){
        return decoratedChristmasTree.decorate()+setSilverBall();
    }

    private String setSilverBall(){
       return " cu globuri argintii";
    }
}
