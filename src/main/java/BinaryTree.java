/**
 * Created by artur on 27.08.2017.
 */
public class BinaryTree {

    public static void main(String[] args) {
        TreeElement randomBinaryTree = generateRandomBinaryTree(6, 0.5, 99);
        System.out.println(randomBinaryTree.toString());
    }

    public static TreeElement generateRandomBinaryTree(int elementsNumber, double probability, int range) {

        /* Tworzymy korzeń */
        TreeElement rootElement = new TreeElement((int)(Math.random() * range));

        /* Tymczasowy element, którym przesuwamy się po drzewie,
        zaczynając od korzenia */
        TreeElement jumpFrog = rootElement;

        /* For wykonujemy tyle razy ile elementów mamy dodać,
        -1 ponieważ utworzyliśmy korzeń */
        for (int i = 0; i < elementsNumber -1; i++ ){

            /* Tworzymy nowy element, który dodamy do drzewa */
            TreeElement newElement = new TreeElement((int)(Math.random() * range));

            /* zmienna przechowująca informację czy został element już dodany */
            boolean newElementWasAdded = false;

            do {
                /* idziemy w lewe poddrzewo */
                if(Math.random() < probability) {
                    if (jumpFrog.getLeftElement() != null) {
                        /* skaczemy na element który wskazuje lewy wskaźnik */
                        jumpFrog = jumpFrog.getLeftElement();
                    } else {
                        /* ustawiamy lewy wskaźnik aktualnemu elementowy na nowo utworzony */
                        jumpFrog.setLeftElement(newElement);
                        newElementWasAdded = true;
                    }

                /* idziemy w prawe poddrzewo */
                } else {
                    if (jumpFrog.getRightElement() != null) {
                        /* skaczemy na element który wskazuje prawy wskaźnik */
                        jumpFrog = jumpFrog.getRightElement();
                    } else {
                        /* ustawiamy prawy wskaźnik aktualnemu elementowy na nowo utworzony */
                        jumpFrog.setRightElement(newElement);
                        newElementWasAdded = true;
                    }
                }
            } while (!newElementWasAdded);
            System.out.println(newElement.toString());
        }

        return rootElement;
    }
}