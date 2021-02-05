import java.rmi.*;

public interface Interest extends Remote {

	// declaration of remote methods

	public float simple(float p, float t,float r) throws RemoteException;

	public float compound(float p, float t,float r,float n) throws RemoteException;
}