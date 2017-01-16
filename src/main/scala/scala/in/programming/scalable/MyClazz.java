package scala.in.programming.scalable;

/**
 * What's difference between scala and java.
 * Example for java.
 * If you wanna see example for scala to @see MyKlass.scala
 *
 * @author loustler
 * @since 01/07/2017 23:08
 */
public class MyClazz {
    private int index;
    private String name;

    public MyClazz(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public boolean nameHasUpper() {
        boolean nameHasUpperCase = false;

        for (int i = 0; i < name.length(); i++) {
            if (Character.isUpperCase(name.charAt(i))) {
                nameHasUpperCase = true;
                break;
            }
        }

        return nameHasUpperCase;
    }
}
