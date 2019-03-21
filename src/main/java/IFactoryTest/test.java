package IFactoryTest;

public class test {

	/***
	 * 现需要设计一个程序来读取多种不同类型的图片格式，针对每一种图片格式都设计一个图片读取器ImgReader,
	 * 如gif图片读取器GifReader用于读取gif格式的图片,
	 * jpg图片读取器JPGReader用于读取jpg格式的图片。
	 * 图片读取器对象通过图片读取器工厂ImgReaderFactory来创建。
	 * ImgReaderFactory是一个抽象类,用于定义创建图片读取器的工厂方法,
	 * 其GifReaderFactory和JPGReaderFactory用于创建具体的图片读取器对象。
	 * 使用工厂方法模式，实现该程序的设计。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImgReaderFactory factory = new GifReaderFactory();
		Reader reader = factory.createReader();
		reader.readImage();
	}

}
