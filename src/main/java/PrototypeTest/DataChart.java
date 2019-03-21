package PrototypeTest;

public class DataChart implements Cloneable{

	private DataSet dataSet;
	private String chart = "图标对象的属性";
	
	public DataChart() {
		// TODO Auto-generated constructor stub
		dataSet = new DataSet();
	}

	public DataSet getDataSet() {
		return dataSet;
	}

	public void setDataSet(DataSet dataSet) {
		this.dataSet = dataSet;
	}

	public String getChart() {
		return chart;
	}

	public void setChart(String chart) {
		this.chart = chart;
	}
	
	public Object clone() throws CloneNotSupportedException {
		DataChart dataChart = (DataChart) super.clone();
		dataChart.dataSet = (DataSet) dataSet.clone();
		return dataChart;
	}
}
