import java.awt.*;

public class CheckFont {

    /**这个类用来检查服务器支持的字符集**/
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String fontname:fontNames)
            System.out.println(fontname);
    }

}
