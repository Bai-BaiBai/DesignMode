package simplefactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Operation operation;
        operation = OperationFactory.createOperate("+");
        operation.setNumberA(3);
        //operation.setNumberB(4);
        System.out.println(operation.getResult());
    }
}
