import java.rmi.*;  
public interface ArrayAdder extends Remote{  
	public int[] add(int x[],int y[], int n)throws RemoteException;  
}  