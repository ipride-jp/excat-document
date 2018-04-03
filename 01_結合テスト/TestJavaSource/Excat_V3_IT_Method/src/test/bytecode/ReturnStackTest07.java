package test.bytecode;

public class ReturnStackTest07 {
	/**
	 * スタックに積む。
	 */
	//7_0 bipush
	public byte ReturnByte_7_0(){
		return 32;
	}
	// 7_0 sipush
	public short ReturnShort_7_0(){
		return 128;
	}
	//7_1 ldc
	public String ReturnString_7_1(){
		return "a";
	}
	//7_2 ldc_w
	public String ReturnFloat_7_2(){
		String  a1  =  " 1 ";
		String  a2  =  " 2 ";
		String  a3  =  " 3 ";
		String  a4  =  " 4 ";
		String  a5  =  " 5 ";
		String  a6  =  " 6 ";
		String  a7  =  " 7 ";
		String  a8  =  " 8 ";
		String  a9  =  " 9 ";
		String  a10  =  " 10 ";
		String  a11  =  " 11 ";
		String  a12  =  " 12 ";
		String  a13  =  " 13 ";
		String  a14  =  " 14 ";
		String  a15  =  " 15 ";
		String  a16  =  " 16 ";
		String  a17  =  " 17 ";
		String  a18  =  " 18 ";
		String  a19  =  " 19 ";
		String  a20  =  " 20 ";
		String  a21  =  " 21 ";
		String  a22  =  " 22 ";
		String  a23  =  " 23 ";
		String  a24  =  " 24 ";
		String  a25  =  " 25 ";
		String  a26  =  " 26 ";
		String  a27  =  " 27 ";
		String  a28  =  " 28 ";
		String  a29  =  " 29 ";
		String  a30  =  " 30 ";
		String  a31  =  " 31 ";
		String  a32  =  " 32 ";
		String  a33  =  " 33 ";
		String  a34  =  " 34 ";
		String  a35  =  " 35 ";
		String  a36  =  " 36 ";
		String  a37  =  " 37 ";
		String  a38  =  " 38 ";
		String  a39  =  " 39 ";
		String  a40  =  " 40 ";
		String  a41  =  " 41 ";
		String  a42  =  " 42 ";
		String  a43  =  " 43 ";
		String  a44  =  " 44 ";
		String  a45  =  " 45 ";
		String  a46  =  " 46 ";
		String  a47  =  " 47 ";
		String  a48  =  " 48 ";
		String  a49  =  " 49 ";
		String  a50  =  " 50 ";
		String  a51  =  " 51 ";
		String  a52  =  " 52 ";
		String  a53  =  " 53 ";
		String  a54  =  " 54 ";
		String  a55  =  " 55 ";
		String  a56  =  " 56 ";
		String  a57  =  " 57 ";
		String  a58  =  " 58 ";
		String  a59  =  " 59 ";
		String  a60  =  " 60 ";
		String  a61  =  " 61 ";
		String  a62  =  " 62 ";
		String  a63  =  " 63 ";
		String  a64  =  " 64 ";
		String  a65  =  " 65 ";
		String  a66  =  " 66 ";
		String  a67  =  " 67 ";
		String  a68  =  " 68 ";
		String  a69  =  " 69 ";
		String  a70  =  " 70 ";
		String  a71  =  " 71 ";
		String  a72  =  " 72 ";
		String  a73  =  " 73 ";
		String  a74  =  " 74 ";
		String  a75  =  " 75 ";
		String  a76  =  " 76 ";
		String  a77  =  " 77 ";
		String  a78  =  " 78 ";
		String  a79  =  " 79 ";
		String  a80  =  " 80 ";
		String  a81  =  " 81 ";
		String  a82  =  " 82 ";
		String  a83  =  " 83 ";
		String  a84  =  " 84 ";
		String  a85  =  " 85 ";
		String  a86  =  " 86 ";
		String  a87  =  " 87 ";
		String  a88  =  " 88 ";
		String  a89  =  " 89 ";
		String  a90  =  " 90 ";
		String  a91  =  " 91 ";
		String  a92  =  " 92 ";
		String  a93  =  " 93 ";
		String  a94  =  " 94 ";
		String  a95  =  " 95 ";
		String  a96  =  " 96 ";
		String  a97  =  " 97 ";
		String  a98  =  " 98 ";
		String  a99  =  " 99 ";
		String  a100  =  " 100 ";
		String  a101  =  " 101 ";
		String  a102  =  " 102 ";
		String  a103  =  " 103 ";
		String  a104  =  " 104 ";
		String  a105  =  " 105 ";
		String  a106  =  " 106 ";
		String  a107  =  " 107 ";
		String  a108  =  " 108 ";
		String  a109  =  " 109 ";
		String  a110  =  " 110 ";
		String  a111  =  " 111 ";
		String  a112  =  " 112 ";
		String  a113  =  " 113 ";
		String  a114  =  " 114 ";
		String  a115  =  " 115 ";
		String  a116  =  " 116 ";
		String  a117  =  " 117 ";
		String  a118  =  " 118 ";
		String  a119  =  " 119 ";
		String  a120  =  " 120 ";
		String  a121  =  " 121 ";
		String  a122  =  " 122 ";
		String  a123  =  " 123 ";
		String  a124  =  " 124 ";
		String  a125  =  " 125 ";
		String  a126  =  " 126 ";
		String  a127  =  " 127 ";
		String  a128  =  " 128 ";
		String  a129  =  " 129 ";
		String  a130  =  " 130 ";
		String  a131  =  " 131 ";
		String  a132  =  " 132 ";
		String  a133  =  " 133 ";
		String  a134  =  " 134 ";
		String  a135  =  " 135 ";
		String  a136  =  " 136 ";
		String  a137  =  " 137 ";
		String  a138  =  " 138 ";
		String  a139  =  " 139 ";
		String  a140  =  " 140 ";
		String  a141  =  " 141 ";
		String  a142  =  " 142 ";
		String  a143  =  " 143 ";
		String  a144  =  " 144 ";
		String  a145  =  " 145 ";
		String  a146  =  " 146 ";
		String  a147  =  " 147 ";
		String  a148  =  " 148 ";
		String  a149  =  " 149 ";
		String  a150  =  " 150 ";
		String  a151  =  " 151 ";
		String  a152  =  " 152 ";
		String  a153  =  " 153 ";
		String  a154  =  " 154 ";
		String  a155  =  " 155 ";
		String  a156  =  " 156 ";
		String  a157  =  " 157 ";
		String  a158  =  " 158 ";
		String  a159  =  " 159 ";
		String  a160  =  " 160 ";
		String  a161  =  " 161 ";
		String  a162  =  " 162 ";
		String  a163  =  " 163 ";
		String  a164  =  " 164 ";
		String  a165  =  " 165 ";
		String  a166  =  " 166 ";
		String  a167  =  " 167 ";
		String  a168  =  " 168 ";
		String  a169  =  " 169 ";
		String  a170  =  " 170 ";
		String  a171  =  " 171 ";
		String  a172  =  " 172 ";
		String  a173  =  " 173 ";
		String  a174  =  " 174 ";
		String  a175  =  " 175 ";
		String  a176  =  " 176 ";
		String  a177  =  " 177 ";
		String  a178  =  " 178 ";
		String  a179  =  " 179 ";
		String  a180  =  " 180 ";
		String  a181  =  " 181 ";
		String  a182  =  " 182 ";
		String  a183  =  " 183 ";
		String  a184  =  " 184 ";
		String  a185  =  " 185 ";
		String  a186  =  " 186 ";
		String  a187  =  " 187 ";
		String  a188  =  " 188 ";
		String  a189  =  " 189 ";
		String  a190  =  " 190 ";
		String  a191  =  " 191 ";
		String  a192  =  " 192 ";
		String  a193  =  " 193 ";
		String  a194  =  " 194 ";
		String  a195  =  " 195 ";
		String  a196  =  " 196 ";
		String  a197  =  " 197 ";
		String  a198  =  " 198 ";
		String  a199  =  " 199 ";
		String  a200  =  " 200 ";
		String  a201  =  " 201 ";
		String  a202  =  " 202 ";
		String  a203  =  " 203 ";
		String  a204  =  " 204 ";
		String  a205  =  " 205 ";
		String  a206  =  " 206 ";
		String  a207  =  " 207 ";
		String  a208  =  " 208 ";
		String  a209  =  " 209 ";
		String  a210  =  " 210 ";
		String  a211  =  " 211 ";
		String  a212  =  " 212 ";
		String  a213  =  " 213 ";
		String  a214  =  " 214 ";
		String  a215  =  " 215 ";
		String  a216  =  " 216 ";
		String  a217  =  " 217 ";
		String  a218  =  " 218 ";
		String  a219  =  " 219 ";
		String  a220  =  " 220 ";
		String  a221  =  " 221 ";
		String  a222  =  " 222 ";
		String  a223  =  " 223 ";
		String  a224  =  " 224 ";
		String  a225  =  " 225 ";
		String  a226  =  " 226 ";
		String  a227  =  " 227 ";
		String  a228  =  " 228 ";
		String  a229  =  " 229 ";
		String  a230  =  " 230 ";
		String  a231  =  " 231 ";
		String  a232  =  " 232 ";
		String  a233  =  " 233 ";
		String  a234  =  " 234 ";
		String  a235  =  " 235 ";
		String  a236  =  " 236 ";
		String  a237  =  " 237 ";
		String  a238  =  " 238 ";
		String  a239  =  " 239 ";
		String  a240  =  " 240 ";
		String  a241  =  " 241 ";
		String  a242  =  " 242 ";
		String  a243  =  " 243 ";
		String  a244  =  " 244 ";
		String  a245  =  " 245 ";
		String  a246  =  " 246 ";
		String  a247  =  " 247 ";
		String  a248  =  " 248 ";
		String  a249  =  " 249 ";
		String  a250  =  " 250 ";
		String  a251  =  " 251 ";
		String  a252  =  " 252 ";
		String  a253  =  " 253 ";
		String  a254  =  " 254 ";
		String  a255  =  " 255 ";
		String  a256  =  " 256 ";
		return "257";
	}
	//7_2 aloadw
	public String ReturnFloat_7_2_aloadw(){
		String  a1  =  " 1 ";
		String  a2  =  " 2 ";
		String  a3  =  " 3 ";
		String  a4  =  " 4 ";
		String  a5  =  " 5 ";
		String  a6  =  " 6 ";
		String  a7  =  " 7 ";
		String  a8  =  " 8 ";
		String  a9  =  " 9 ";
		String  a10  =  " 10 ";
		String  a11  =  " 11 ";
		String  a12  =  " 12 ";
		String  a13  =  " 13 ";
		String  a14  =  " 14 ";
		String  a15  =  " 15 ";
		String  a16  =  " 16 ";
		String  a17  =  " 17 ";
		String  a18  =  " 18 ";
		String  a19  =  " 19 ";
		String  a20  =  " 20 ";
		String  a21  =  " 21 ";
		String  a22  =  " 22 ";
		String  a23  =  " 23 ";
		String  a24  =  " 24 ";
		String  a25  =  " 25 ";
		String  a26  =  " 26 ";
		String  a27  =  " 27 ";
		String  a28  =  " 28 ";
		String  a29  =  " 29 ";
		String  a30  =  " 30 ";
		String  a31  =  " 31 ";
		String  a32  =  " 32 ";
		String  a33  =  " 33 ";
		String  a34  =  " 34 ";
		String  a35  =  " 35 ";
		String  a36  =  " 36 ";
		String  a37  =  " 37 ";
		String  a38  =  " 38 ";
		String  a39  =  " 39 ";
		String  a40  =  " 40 ";
		String  a41  =  " 41 ";
		String  a42  =  " 42 ";
		String  a43  =  " 43 ";
		String  a44  =  " 44 ";
		String  a45  =  " 45 ";
		String  a46  =  " 46 ";
		String  a47  =  " 47 ";
		String  a48  =  " 48 ";
		String  a49  =  " 49 ";
		String  a50  =  " 50 ";
		String  a51  =  " 51 ";
		String  a52  =  " 52 ";
		String  a53  =  " 53 ";
		String  a54  =  " 54 ";
		String  a55  =  " 55 ";
		String  a56  =  " 56 ";
		String  a57  =  " 57 ";
		String  a58  =  " 58 ";
		String  a59  =  " 59 ";
		String  a60  =  " 60 ";
		String  a61  =  " 61 ";
		String  a62  =  " 62 ";
		String  a63  =  " 63 ";
		String  a64  =  " 64 ";
		String  a65  =  " 65 ";
		String  a66  =  " 66 ";
		String  a67  =  " 67 ";
		String  a68  =  " 68 ";
		String  a69  =  " 69 ";
		String  a70  =  " 70 ";
		String  a71  =  " 71 ";
		String  a72  =  " 72 ";
		String  a73  =  " 73 ";
		String  a74  =  " 74 ";
		String  a75  =  " 75 ";
		String  a76  =  " 76 ";
		String  a77  =  " 77 ";
		String  a78  =  " 78 ";
		String  a79  =  " 79 ";
		String  a80  =  " 80 ";
		String  a81  =  " 81 ";
		String  a82  =  " 82 ";
		String  a83  =  " 83 ";
		String  a84  =  " 84 ";
		String  a85  =  " 85 ";
		String  a86  =  " 86 ";
		String  a87  =  " 87 ";
		String  a88  =  " 88 ";
		String  a89  =  " 89 ";
		String  a90  =  " 90 ";
		String  a91  =  " 91 ";
		String  a92  =  " 92 ";
		String  a93  =  " 93 ";
		String  a94  =  " 94 ";
		String  a95  =  " 95 ";
		String  a96  =  " 96 ";
		String  a97  =  " 97 ";
		String  a98  =  " 98 ";
		String  a99  =  " 99 ";
		String  a100  =  " 100 ";
		String  a101  =  " 101 ";
		String  a102  =  " 102 ";
		String  a103  =  " 103 ";
		String  a104  =  " 104 ";
		String  a105  =  " 105 ";
		String  a106  =  " 106 ";
		String  a107  =  " 107 ";
		String  a108  =  " 108 ";
		String  a109  =  " 109 ";
		String  a110  =  " 110 ";
		String  a111  =  " 111 ";
		String  a112  =  " 112 ";
		String  a113  =  " 113 ";
		String  a114  =  " 114 ";
		String  a115  =  " 115 ";
		String  a116  =  " 116 ";
		String  a117  =  " 117 ";
		String  a118  =  " 118 ";
		String  a119  =  " 119 ";
		String  a120  =  " 120 ";
		String  a121  =  " 121 ";
		String  a122  =  " 122 ";
		String  a123  =  " 123 ";
		String  a124  =  " 124 ";
		String  a125  =  " 125 ";
		String  a126  =  " 126 ";
		String  a127  =  " 127 ";
		String  a128  =  " 128 ";
		String  a129  =  " 129 ";
		String  a130  =  " 130 ";
		String  a131  =  " 131 ";
		String  a132  =  " 132 ";
		String  a133  =  " 133 ";
		String  a134  =  " 134 ";
		String  a135  =  " 135 ";
		String  a136  =  " 136 ";
		String  a137  =  " 137 ";
		String  a138  =  " 138 ";
		String  a139  =  " 139 ";
		String  a140  =  " 140 ";
		String  a141  =  " 141 ";
		String  a142  =  " 142 ";
		String  a143  =  " 143 ";
		String  a144  =  " 144 ";
		String  a145  =  " 145 ";
		String  a146  =  " 146 ";
		String  a147  =  " 147 ";
		String  a148  =  " 148 ";
		String  a149  =  " 149 ";
		String  a150  =  " 150 ";
		String  a151  =  " 151 ";
		String  a152  =  " 152 ";
		String  a153  =  " 153 ";
		String  a154  =  " 154 ";
		String  a155  =  " 155 ";
		String  a156  =  " 156 ";
		String  a157  =  " 157 ";
		String  a158  =  " 158 ";
		String  a159  =  " 159 ";
		String  a160  =  " 160 ";
		String  a161  =  " 161 ";
		String  a162  =  " 162 ";
		String  a163  =  " 163 ";
		String  a164  =  " 164 ";
		String  a165  =  " 165 ";
		String  a166  =  " 166 ";
		String  a167  =  " 167 ";
		String  a168  =  " 168 ";
		String  a169  =  " 169 ";
		String  a170  =  " 170 ";
		String  a171  =  " 171 ";
		String  a172  =  " 172 ";
		String  a173  =  " 173 ";
		String  a174  =  " 174 ";
		String  a175  =  " 175 ";
		String  a176  =  " 176 ";
		String  a177  =  " 177 ";
		String  a178  =  " 178 ";
		String  a179  =  " 179 ";
		String  a180  =  " 180 ";
		String  a181  =  " 181 ";
		String  a182  =  " 182 ";
		String  a183  =  " 183 ";
		String  a184  =  " 184 ";
		String  a185  =  " 185 ";
		String  a186  =  " 186 ";
		String  a187  =  " 187 ";
		String  a188  =  " 188 ";
		String  a189  =  " 189 ";
		String  a190  =  " 190 ";
		String  a191  =  " 191 ";
		String  a192  =  " 192 ";
		String  a193  =  " 193 ";
		String  a194  =  " 194 ";
		String  a195  =  " 195 ";
		String  a196  =  " 196 ";
		String  a197  =  " 197 ";
		String  a198  =  " 198 ";
		String  a199  =  " 199 ";
		String  a200  =  " 200 ";
		String  a201  =  " 201 ";
		String  a202  =  " 202 ";
		String  a203  =  " 203 ";
		String  a204  =  " 204 ";
		String  a205  =  " 205 ";
		String  a206  =  " 206 ";
		String  a207  =  " 207 ";
		String  a208  =  " 208 ";
		String  a209  =  " 209 ";
		String  a210  =  " 210 ";
		String  a211  =  " 211 ";
		String  a212  =  " 212 ";
		String  a213  =  " 213 ";
		String  a214  =  " 214 ";
		String  a215  =  " 215 ";
		String  a216  =  " 216 ";
		String  a217  =  " 217 ";
		String  a218  =  " 218 ";
		String  a219  =  " 219 ";
		String  a220  =  " 220 ";
		String  a221  =  " 221 ";
		String  a222  =  " 222 ";
		String  a223  =  " 223 ";
		String  a224  =  " 224 ";
		String  a225  =  " 225 ";
		String  a226  =  " 226 ";
		String  a227  =  " 227 ";
		String  a228  =  " 228 ";
		String  a229  =  " 229 ";
		String  a230  =  " 230 ";
		String  a231  =  " 231 ";
		String  a232  =  " 232 ";
		String  a233  =  " 233 ";
		String  a234  =  " 234 ";
		String  a235  =  " 235 ";
		String  a236  =  " 236 ";
		String  a237  =  " 237 ";
		String  a238  =  " 238 ";
		String  a239  =  " 239 ";
		String  a240  =  " 240 ";
		String  a241  =  " 241 ";
		String  a242  =  " 242 ";
		String  a243  =  " 243 ";
		String  a244  =  " 244 ";
		String  a245  =  " 245 ";
		String  a246  =  " 246 ";
		String  a247  =  " 247 ";
		String  a248  =  " 248 ";
		String  a249  =  " 249 ";
		String  a250  =  " 250 ";
		String  a251  =  " 251 ";
		String  a252  =  " 252 ";
		String  a253  =  " 253 ";
		String  a254  =  " 254 ";
		String  a255  =  " 255 ";
		String  a256  =  " 256 ";
		return a256;
	}
	
	//7_3 ldc2_w
	public double ReturnDouble_7_3(){
		return 123456789.0d;
	}
	
	//7_4 iconst_m1
	public int ReturnInt_m01_7_4(){
		return -1;
	}
	//7_4 iconst_0
	public int ReturnInt_00_7_4(){
		return 0;
	}
	//7_4 iconst_1
	public int ReturnInt_01_7_4(){
		return 1;
	}
	//7_4 iconst_2
	public int ReturnInt_02_7_4(){
		return 2;
	}
	//7_4 iconst_3
	public int ReturnInt_03_7_4(){
		return 3;
	}
	//7_4 iconst_4
	public int ReturnInt_04_7_4(){
		return 4;
	}
	//7_4 iconst_5
	public int ReturnInt_05_7_4(){
		return 5;
	}
	
	//7_5 lconst_0
	public long ReturnLong_00_7_5(){
		return 0;
	}
	//7_5 lconst_1
	public long ReturnLong_01_7_5(){
		return 1;
	}
	
	//7_6 fconst_0
	public float ReturnFloat_00_7_6(){
		return 0;
	}
	//7_6 fconst_1
	public float ReturnFloat_01_7_6(){
		return 1;
	}
	//7_6 fconst_2
	public float ReturnFloat_02_7_6(){
		return 2;
	}
	
	//7_7 dconst_0
	public double ReturnDouble_00_7_7(){
		return 0;
	}
	//7_7 dconst_1
	public double ReturnDouble_01_7_7(){
		return 1;
	}
	
	//7_8 aconst_null
	public String ReturnNull_7_8(){
		return null;
	}
	
	//7_99 aconst_null
	public int ReturnGenInt_7_99(){
		return 8;
	}
}
