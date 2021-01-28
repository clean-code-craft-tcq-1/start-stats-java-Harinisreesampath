package statisticker;

import java.util.List;



public class Statistics 
{
	
    public static Stats getStatistics(List<Float> numbers) {
    	
       	Float min = 0.0f, max = 0.0f;
    	Stats stats = new Stats();
    	
    	int totalNo = numbers.size();
    	if(totalNo == 0) {
    		stats.average=Float.NaN;
        	stats.min=Float.NaN;
        	stats.max=Float.NaN;
           	return stats;
    		
    	}
    	float sumTotal = 0;
    	boolean flag = true;
    	for(Float  no: numbers) {    		
    		if(flag) {
    			min=no;
    			max=no;
    		    flag = false;
    		}
    		if(no>max) {
    			max=no;
    		}
    		if(no<min) {
    			min=no;
    		}
    		sumTotal += no;
    	}
    	
    	float avg=sumTotal/totalNo;
    	stats.average=avg;
    	stats.min=min;
    	stats.max=max;
       	return stats;
    	
    	/*
    	for(Float num: numbers)
    	{
    		if(count == 0)
    		{
    			min = num;
    			max = num;
    		}
    		if(num>max)
    		{
    			max = num; 
    		}
    		if(num<min)
    		{
    			min = num;
    		}
    		sum = sum + num;
    		
			count++;
    	}
    
    	average = sum/count;	
    	s.average=average;
    	s.min=min;
    	s.max=max;
       	return s;*/
    	
    	
    }
    public static class Stats
    {
    	public float average;
		public float min;
		public float max;
	
    }
}
