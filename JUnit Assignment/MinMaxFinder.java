package com.testing.app;

public class MinMaxFinder {
	public int[] findMinMax(int arr[]){
		int min=arr[0], max=arr[0];
		for(int x: arr) {
			if(min>x)
				min=x;
		}
		for(int x: arr) {
			if(max<x)
				max=x;
		}
		int[] ret= {min, max};
		return ret;
	}
}
