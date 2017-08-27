/**
 * Created by artur on 27.08.2017.
 */
public class TreeElement {
    private int elementValue;
    private TreeElement leftElement;
    private TreeElement rightElement;

    public TreeElement() {

    }
    public TreeElement(int elementValue) {
        this.elementValue = elementValue;
    }

    public TreeElement(int elementValue, TreeElement leftElement, TreeElement rightElement) {
        this.elementValue = elementValue;
        this.leftElement = leftElement;
        this.rightElement = rightElement;
    }

    @Override
    public String toString() {
        return "TreeElement{" +
                "elementValue=" + elementValue +
                ", leftElement=" + leftElement +
                ", rightElement=" + rightElement +
                '}'+ "\n";
    }

    public int getElementValue() {
        return elementValue;
    }

    public void setElementValue(int elementValue) {
        this.elementValue = elementValue;
    }

    public TreeElement getLeftElement() {
        return leftElement;
    }

    public void setLeftElement(TreeElement leftElement) {
        this.leftElement = leftElement;
    }

    public TreeElement getRightElement() {
        return rightElement;
    }

    public void setRightElement(TreeElement rightElement) {
        this.rightElement = rightElement;
    }


}
