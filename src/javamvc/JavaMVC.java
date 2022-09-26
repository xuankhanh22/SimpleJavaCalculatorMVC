
package javamvc;

import Models.Model;
import Views.View;
import Controllers.Controler;
public class JavaMVC {

    public static void main(String[] args) {

        Model model=new Model();
        View view=new View();
       Controler ctr= new Controler(view, model);
       view.setVisible(true);
    
}
}
