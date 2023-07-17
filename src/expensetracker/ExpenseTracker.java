/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expensetracker;

/**
 *
 * @author teamSWBois
 */
public class ExpenseTracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        welcomeUser wu=new welcomeUser();
        wu.setVisible(true);
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(20);
                wu.loadvalue.setText(Integer.toString(i)+"%");
                
                Signup1 su=new Signup1();
                if(i==10)
                    wu.loading.setText("Reaching modules...");
                if(i==20)
                    wu.loading.setText("Opening modules...");
                if(i==50)
                    wu.loading.setText("Connecting Database...");
                if(i==70)
                    wu.loading.setText("Database connected...");
                if(i==80)
                    wu.loading.setText("Opening Application");
                if(i==100){
                    wu.dispose();
                    su.show();
                }
                wu.loader.setValue(i);
            }
               
            
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
