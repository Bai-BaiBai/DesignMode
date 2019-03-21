package PrototypeTest;

public class test {

	/**
	 * 某数据处理软件需要增加一个图表复制功能。
	 * 在图表对象（DataChart）中包含一个数据集对象(DataSet)。
	 * 数据集对象用于封装要显示的数据，用户可以通过界面上的复制按钮将该图表复制一份，
	 * 复制后，即可得到新的图表对象，然后可以修改新图表的编号、颜色、数据。
	 * 试用原型模式设计软件实现深克隆。
	 */
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		DataChart dataChart1 = new DataChart();
		System.out.println(dataChart1.getChart());
		System.out.println(dataChart1.getDataSet().getSet());
		System.out.println("-------");
		DataChart dataChart2 = (DataChart) dataChart1.clone();
		dataChart2.setChart("复制后的chart");
		dataChart2.getDataSet().setSet("复制后的set");
		System.out.println(dataChart2.getChart());
		System.out.println(dataChart2.getDataSet().getSet());
		System.out.println("-------");
		System.out.println(dataChart1.getChart());
		System.out.println(dataChart1.getDataSet().getSet());
		System.out.println("-------");
	}

}
