package work_with_files;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamsEx {

  public static void main(String[] args) {
    try(DataOutputStream output = new DataOutputStream(new FileOutputStream("my_test.bin"));
        DataInputStream input = new DataInputStream(new FileInputStream("my_test.bin"))) {

      output.writeByte(2);
      output.writeInt(500);
      output.writeBoolean(false);
      output.writeChar('w');
      output.writeLong(1_000_000L);
      output.writeFloat(3.14F);

      System.out.println(input.readByte());
      System.out.println(input.readInt());
      System.out.println(input.readBoolean());
      System.out.println(input.readChar());
      System.out.println(input.readLong());
      System.out.println(input.readFloat());

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
