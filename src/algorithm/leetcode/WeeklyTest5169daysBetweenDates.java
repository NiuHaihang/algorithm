package algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WeeklyTest5169daysBetweenDates {
	public int daysBetwwenDates(String date1,String date2) {
		String[] date1String = date1.split("-");
		String[] date2String = date2.split("-");
		int ans=0;
		int year1 = Integer.parseInt(date1String[0]);
		int month1 = Integer.parseInt(date1String[1]);
		int day1 = Integer.parseInt(date1String[2]);
		int year2 = Integer.parseInt(date2String[0]);
		int month2 = Integer.parseInt(date2String[1]);
		int day2 = Integer.parseInt(date2String[2]);
		if(year1>year2||year1==year2&&month1>month2||year1==year2&&month1==month2&&day1>day2) {
			int temp=year1;
			year1=year2;year2=temp;temp=month1;month1=month2;month2=temp;temp=day1;day1=day2;day2=temp;
		}
		Map<Integer,Integer> monthmap = new HashMap<>();
		monthmap.put(1, 31);
		monthmap.put(2, 28);
		monthmap.put(3, 31);
		monthmap.put(4, 30);
		monthmap.put(5, 31);
		monthmap.put(6, 30);
		monthmap.put(7, 31);
		monthmap.put(8, 31);
		monthmap.put(9, 30);
		monthmap.put(10, 31);
		monthmap.put(11, 30);
		monthmap.put(12, 31);
		if(year2==year1&&year2%4!=0) {
			for(int i=month1;i<=month2;i++) {
				ans+=monthmap.get(i);
			}
			ans-=day1;
			ans-=(monthmap.get(month2)-day2);
		}
		if(year2==year1&&year2%4==0&&year2!=2100) {
			for(int i=month1;i<=month2;i++) {
				ans+=monthmap.get(i);
			}
			ans-=day1;
			ans-=(monthmap.get(month2)-day2);
			if(month1<=2&&month2>=2) {
				ans+=1;
			}
		}
		if(year2==year1&&year2==2100) {
			for(int i=month1;i<=month2;i++) {
				ans+=monthmap.get(i);
			}
			ans-=day1;
			ans-=(monthmap.get(month2)-day2);
		}
		if(year2>year1&&year2!=2100) {
			ans+=365*(year2-year1-1);
			for(int i=month1;i<=12;i++) {
				ans+=monthmap.get(i);
			}
			ans-=day1;
			for(int i=1;i<=month2;i++) {
				ans+=monthmap.get(i);
			}
			ans-=(monthmap.get(month2)-day2);
			for(int i=year1+1;i<year2;i++) {
				if(i%4==0) {
					ans++;
				}
			}
			if(year1%4==0&&month1<=2) {
				ans+=1;
			}
			if(year2%4==0&&month2>2) {
				ans+=1; 
			}
			/*if(year2%4==0&&month2==2) {
				ans-=1;
			}*/
		}
		if(year2>year1&&year2==2100) {
			ans+=365*(year2-year1-1);
			for(int i=month1;i<=12;i++) {
				ans+=monthmap.get(i);
			}
			ans-=day1;
			for(int i=1;i<=month2;i++) {
				ans+=monthmap.get(i);
			}
			ans-=(monthmap.get(month2)-day2);
			for(int i=year1+1;i<year2;i++) {
				if(i%4==0) {
					ans++;
				}
			}
			if(year1%4==0&&month1<=2) {
				ans+=1;
			}
		}
		return ans;
		
	}
	public static void main(String[] args) {
		WeeklyTest5169daysBetweenDates test = new WeeklyTest5169daysBetweenDates();
		int ans=test.daysBetwwenDates("2019-12-31", "2020-02-11");
		System.out.println(ans);
	}
}
