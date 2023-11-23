package service;

public class ScoreOper {

	public int getAge(int year) {
		return 2023 - year;
	}

	public int getTotal(int java, int mysql, int web) {
		return (java + mysql + web);
	}

	public double getAvg(int total, int i) {
		return total / i;
	}

	public String getGrade(int avg) {
		String result = "";
		int v10 = avg / 10;
		int v1 = avg % 10;
		
		if (v10>=9) {
			result="A";
		} else if(v10>=8) {
			result="B";
		} else if(v10>=7) {
			result="C";
		} else if(v10>=6) {
			result="D";
		} else {
			result="F";
		}
		
		if (v10 == 10) {
			result += "+";
		}
		
		if (v1 >= 5) {
			result += "+";
		} else {
			result += "0";
		}
		
		return result;
	}

}
