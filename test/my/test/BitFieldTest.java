package my.test;

import org.h2.util.BitField;

public class BitFieldTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BitField bf = new BitField();
		bf = new BitField(0);
		bf = new BitField(1);
		bf = new BitField(8);
		bf = new BitField(100);
		bf.set(64);
		System.out.println(bf.length());

		bf.set(0, 514, true);

		long i = bf.nextClearBit(0);

		System.out.println(i);

		System.out.println(bf.length());

		for (i = 0; i < 128; i++)
			System.out.println(i + " " + (i & 63));

		i = getBitMask(63);
		i = getBitMask(65);

		System.out.println(i);

	}

	private static long getBitMask(int i) {
		return 1L << (i & ADDRESS_MASK); //(i & ADDRESS_MASK)�൱�ڰ�63ȡģ(�õ���ֵ��0��63)
	}

	private static final int BITS = 64;
	private static final int ADDRESS_MASK = BITS - 1;
}