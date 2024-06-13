package com.test;
import com.media.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Media[] medias = new Media[3];
		medias[0] = new Book();
		medias[1] = new CD();
		medias[2] = new DVD();
		
		for(Media media : medias){
			media.displayInfo();
			
		}
		
		

	}

}
