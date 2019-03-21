package IFactoryTest;

public class GifReaderFactory implements ImgReaderFactory {

	@Override
	public Reader createReader() {
		// TODO Auto-generated method stub
		return new GifReader();
	}

}
