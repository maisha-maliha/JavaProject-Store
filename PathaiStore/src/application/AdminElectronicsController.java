package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class AdminElectronicsController {
HomeController home = new HomeController();
	
	//========= ALL PAGE METHODS ========== 
	public void callHome(ActionEvent event) {
		home.ChangingToHome(event);
	}
	public void callFood(ActionEvent event) {
		home.ChangingToAdminFood(event);
	}
	public void callClothes(ActionEvent event) {
		home.ChangingToAdminClothes(event);
	}
	public void callElectronics(ActionEvent event) {
		home.ChangingToAdminElectronics(event);
	}
	
	//============ ALL ACTIONS ==============
	
	@FXML
	public ListView<String> listview = new ListView<String>(); 
	
		public String filepath = "src/application/ElectronicsIteamName.txt";
		public String filepath2 = "src/application/ElectronicsIteamName2.txt";
		public String currentfile = filepath;
		int number = 1;
		public void readsfiles(boolean all, boolean delete, boolean edit, boolean ranonce) throws Exception{
			File oldfile = new File(filepath);
			FileReader fr=new FileReader(oldfile);    
	        BufferedReader br=new BufferedReader(fr);   
	        Scanner fileScanner = new Scanner(fr); 
	       
	        File nfile = new File(filepath2);
	        FileWriter nfr=new FileWriter(nfile, true); 
	        if(all) {
	        	number = 1;
	        	System.out.println(filepath);
	        	while(fileScanner.hasNextLine()){
	            	if(ranonce) {
	            		listview.getItems().remove(number-1);
	            		listview.getItems().add(fileScanner.nextLine());
	            	}
	            	else {
	            		listview.getItems().add(fileScanner.nextLine());
	            	}
	            }
	        	br.close();    
	            fr.close(); 
	            fileScanner.close();
	        }
	        if(delete) {
	        	number = 0;
	        	String line = listview.getSelectionModel().getSelectedItem();
	        	String[] id = line.split("-");
	            while(fileScanner.hasNextLine()){
	            	
	            	String[] data = fileScanner.nextLine().split("-");
//	            	listview.getItems().remove(number-1);
	            	if(data[0].equals(id[0])) {
	            		listview.getItems().remove(number);
	            		continue;
	            	}
	            	System.out.println(data[5]);
	            	nfr.write( (number+1) +"-" + data[1] + "-" + data[2] + "-" + data[3] + "-" + data[4] + "-" + data[5] + "-" +data[6] + "\n");
	            	number++;
	            }
	            nfr.close();
	            fileScanner.close();
	            if(nfile.getPath().equals(filepath2)) {
	            	String file = filepath2;
	            	filepath2 = filepath;
	            	filepath = filepath2;
	            	currentfile = file;
	            } else {
	            	String file = filepath;
	            	filepath = filepath2;
	            	filepath2 = file;
	            	currentfile = filepath;
	            }
//	            System.out.println(filepath2);
	            oldfile.delete();
	            readsfiles(true, false, false, true);
	        }
//	        if(edit) {
//	        	number = 0;
//	        	String line = listview.getSelectionModel().getSelectedItem();
//	        	String[] id = line.split("-");
//	            while(fileScanner.hasNextLine()){
//	            	System.out.println(fileScanner.nextLine());
//	            	String[] data = fileScanner.nextLine().split("-");
//	            	if(data[0].equals(id[0])) {
////	            		pname = new TextField(data[1]);
//	            		quantity = new TextField(data[2]);
//	            		mfd = new TextField(data[3]);
//	            		expd = new TextField(data[4]);
//	            		price = new TextField(data[5]);
//	            		
//	            	}
//	            	
//	            }
//	            
//	        }
		}
		boolean showed = true;
		public void btnact(ActionEvent event) throws Exception {
			if(showed) {
				readsfiles(true, false , false, false);
				showed = false;
			}
		}
		
		public void btndelete() throws Exception {
			readsfiles(false, true, false, false);
		}
		public void btnedit() throws Exception {
			readsfiles(false, false, true, false);
		}
//		public void btnupdate(ActionEvent event, int number) throws Exception {
//			boolean isSelected = checkbox.isSelected();
//			String value;
//			if(isSelected) {
//				value= "on";
//			} else {
//				value = "off";
//			}
//			listview.getItems().add(pname.getText() + " - " + quantity.getText() + " (quantity) - " + mfd.getText() + " (mfd) - " + expd.getText() + " (expd) - " + price.getText() + " (price) - " + value);
//		}
//		public void Addact(ActionEvent event) throws Exception {
//			boolean isSelected = checkbox.isSelected();
//			String value;
//			if(isSelected) {
//				value= "on";
//			} else {
//				value = "off";
//			}
//			FileWriter fw = new FileWriter(currentfile,true); //the true will append the new data
//		    fw.write(number + " - "+pname.getText() + " - " + quantity.getText() + " (quantity) - " + mfd.getText() + " (mfd) - " + expd.getText() + " (expd) - " + price.getText() + " (price) - " + value);//appends the string to the file
//			listview.getItems().add(pname.getText() + " - " + quantity.getText() + " (quantity) - " + mfd.getText() + " (mfd) - " + expd.getText() + " (expd) - " + price.getText() + " (price) - " + value);
//			fw.close();
//		}
}
