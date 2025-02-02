///////////////////////File Header///////////////////////////
//Author: Zhe Wang
//Email: zwang2428@wisc.edu
//Term: Summer2020
////////////////////////////////////////////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * This class read in and add file into the dataStorage
 * @author Zhe Wang
 *
 */
public class FileManager {
	DataStorage a;
	public FileManager(File file, DataStorage a) throws IOException{
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader(file));
		int end = 0;
		int a2 = 0;
		while((line = br.readLine()) != null){
			try {

				if((line = br.readLine()).equals("")) {
					end+=1;
					continue;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(9999);
			}
			end = 0;
			
			String[] array = line.split(",");
			
			String year = array[0].substring(0, 4);
			//System.out.println(a2);
			//a2+=1;
			String id = array[0].substring(4, 6);
			String specific_time = array[0].substring(7, array[0].length());
			String lat = array[1];
			String Long = array[2];
			String Prs = array[3];
			String Wnd = array[4];
			
			System.out.println(Long);
			
			Typhoon t = new Typhoon(year, specific_time, lat, Long, Prs, Wnd);
			a.insert(id, t);
			

		}
		System.out.println(10086);
	}


}
