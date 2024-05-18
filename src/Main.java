//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Список выполненных команд:" +
                "\ngit init" +
                "\n git add ." +
                "\ngit commit -m \"First adding\"" +
                "\n git branch blog" +
                "\n git checkout blog" +
                "\ngit remote add origin https://github.com/AndreiKorobeinikov/Module5test.git" +
                "\ngit add ." +
                "\ngit commit -m \"blog added\"" +//Да, это было не нужно, но для чистоты эксперимента
                "\ngit checkout master" +
                "\ngit push -u origin master" +
                "\n СПИСОК .gitignore" +
                "\n *.sass\n" +
                " bin/\n" +
                " admin/\n" +
                " config/");
    }
}