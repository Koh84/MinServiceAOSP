package android.os;

interface ISerialSysService {
/**
* {@hide}
*/
	String read_timed(int maxLength, int timeout);
	String read(int maxLength);
	int write(String mString);
	int enable_serial();
	int disable_serial();
}

