package t_10_innerClasses.ex19;

public class Outer {

    class Inner {

        class InnerInner {

            class InnerInnerInner {

                class InnerInnerInnerInner {
                    public void print()
                    {
                        System.out.println("I am inner inner inner inner class");
                    }
                }

            }

        }

    }

    public static void main(String[] args)
    {

        new Outer().new Inner().new InnerInner().new InnerInnerInner().new InnerInnerInnerInner().print();
    }

}
