package userfuncs.binaryfuncs;

public interface BinaryFunc {

    /**
     * отримати ім'я функції
     * @return
     */
    public String getName();

    /**
     * функція до виконнання. має бути представлена в конкретних реалізаціях
     * @param a
     * @param b
     * @return
     */
    public int func(int a, int b);
}
