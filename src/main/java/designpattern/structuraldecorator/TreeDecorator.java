package designpattern.structuraldecorator;

public abstract class TreeDecorator implements ChristmasTree{

    protected ChristmasTree decoratedChristmasTree;

    public TreeDecorator(ChristmasTree decoratedChristmasTree) {

        this.decoratedChristmasTree = decoratedChristmasTree;
    }

    public String decorate(){
        return decoratedChristmasTree.decorate();
    }

}
