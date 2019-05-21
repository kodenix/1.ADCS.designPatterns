package designPatterns.patterns.visitor.v4.visitor;

public class ConcreteElementB implements Element {

	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}

}
