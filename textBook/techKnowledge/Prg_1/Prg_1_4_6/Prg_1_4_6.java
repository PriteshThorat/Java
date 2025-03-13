import java.awt.*;
import java.applet.*;

/*
<applet
<<<<<<< HEAD
    code="Prg_1_4_6"
    width="500"
    height="500" >
=======
  code="Prg_1_4_6"
  width="500"
  height="500" >
>>>>>>> 5a59265 (Some Changes)
</applet>
*/

public class Prg_1_4_6 extends Applet{
<<<<<<< HEAD
    public void init(){
        List ls1 = new List(4);
        List ls2 = new List(5, true);

        ls1.add("India");
        ls1.add("China");
        ls1.add("Australia");
        ls1.add("America");
        ls2.add("Andhra Pradesh");
        ls2.add("Karnataka");
        ls2.add("Gujarat");
        ls2.add("Maharashtra");
        ls2.add("Bihar");
        ls2.add("J & K");
        add(ls1);
        add(ls2);
    }
}
=======
  public void init(){
    List ls1 = new List(4);
    List ls2 = new List(5, true);

    ls1.add("India");
    ls1.add("China");
    ls1.add("Australia");
    ls1.add("America");
    ls2.add("Andhra Pradesh");
    ls2.add("Karnataka");
    ls2.add("Gujarat");
    ls2.add("Maharashtra");
    ls2.add("Bihar");
    ls2.add("J & K");
    add(ls1);
    add(ls2);
  }
};
>>>>>>> 5a59265 (Some Changes)
