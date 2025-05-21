public class Child extends Person{
    private Parent parent1;
    private Parent parent2;
    private Child[] siblings;

    public Child(String name, int age, Parent parent1, Parent parent2) {
        super(name, age);
        this.parent1 = parent1;
        this.parent2 = parent2;
        this.siblings = new Child[0];
    }
    public Parent getParent1() {
        return this.parent1;
    }

    public Parent getParent2() {
        return this.parent2;
    }

    public Child[] getSiblings() {
        return this.siblings;
    }

    public void setSiblings(Child[] Sibling) {
        this.siblings = Sibling;
    }

    public void addSibling(Child child) {
        Child[] newSibling = new Child[siblings.length + 1];
        for (int i = 0; i < newSibling.length; i++) {
            newSibling[i] = siblings[i];
        }
        this.siblings[newSibling.length] = child;
        siblings = newSibling;
    }

}
