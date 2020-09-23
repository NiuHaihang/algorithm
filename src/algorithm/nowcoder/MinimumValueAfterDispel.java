package algorithm.nowcoder;

import java.util.Arrays;

public class MinimumValueAfterDispel {
	public long minimumValueAfterDispel(int[] nums) {
		subtract(nums);
		subtract(nums);
		long ansSum = 0;
		for(int i=0;i<nums.length;i++) {
			ansSum += nums[i];
		}
		return ansSum;
	}
	public void subtract(int[] nums) {
		Arrays.sort(nums);
		int width = nums.length;
		int index = 0;
		int area = 0;
		for(int i=0; i<width;i++) {
			int temp = nums[i]*(width-i);
			if(temp > area) {
				index = i;
				area = temp;
			}
		}
		int sub = nums[index];
		System.out.println(Arrays.toString(nums));
		for(int i=index;i<width;i++) {
			nums[i] -= sub;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		MinimumValueAfterDispel ans = new MinimumValueAfterDispel();
		int[] nums = {604, 349, 741, 143, 667, 997, 255, 653, 720, 631, 611, 574, 770, 125, 419, 292, 311, 756, 702, 816, 122, 602, 813, 551, 698, 764, 839, 531, 40, 239, 907, 841, 378, 710, 964, 34, 666, 864, 791, 166, 341, 987, 749, 700, 185, 96, 236, 471, 31, 569, 290, 398, 481, 472, 37, 496, 818, 393, 267, 528, 942, 429, 570, 52, 237, 80, 120, 236, 421, 8, 320, 901, 257, 767, 603, 903, 666, 373, 673, 561, 507, 736, 786, 401, 994, 746, 287, 874, 505, 516, 749, 514, 413, 883, 868, 865, 184, 19, 309, 912, 236, 827, 292, 452, 434, 32, 25, 972, 762, 123, 614, 767, 301, 812, 917, 967, 429, 921, 12, 855, 717, 965, 781, 377, 909, 492, 906, 265, 478, 538, 401, 203, 222, 418, 247, 982, 715, 168, 779, 681, 73, 507, 222, 274, 834, 330, 799, 324, 407, 310, 650, 909, 732, 540, 687, 128, 557, 883, 281, 392, 140, 103, 736, 302, 482, 711, 663, 776, 316, 460, 33, 785, 728, 686, 450, 981, 968, 729, 829, 587, 409, 305, 881, 192, 974, 370, 82, 262, 763, 132, 831, 390, 180, 541, 404, 758, 920, 607, 252, 614, 214, 51, 676, 802, 387, 430, 566, 978, 962, 147, 120, 489, 422, 118, 285, 783, 512, 548, 922, 547, 346, 530, 204, 433, 10, 145, 456, 606, 481, 410, 686, 23, 326, 834, 421, 611, 434, 432, 137, 926, 74, 64, 637, 282, 283, 316, 70, 957, 113, 919, 282, 414, 280, 992, 785, 815, 720, 343, 967, 304, 248, 204, 815, 952, 796, 205, 874, 638, 663, 404, 62, 690, 921, 317, 848, 856, 409, 651, 856, 953, 241, 376, 175, 103, 804, 28, 985, 395, 569, 390, 481, 639, 260, 565, 43, 959, 107, 18, 883, 577, 477, 197, 929, 632, 855, 789, 378, 51, 977, 489, 24, 487, 94, 922, 956, 498, 571, 191, 170, 157, 134, 129, 753, 812, 875, 592, 930, 458, 361, 534, 649, 890, 62, 590, 151, 437, 685, 93, 374, 97, 348, 759, 442, 336, 646, 736, 875, 462, 486, 485, 874, 964, 270, 655, 781, 450, 281, 413, 905, 637, 350, 33, 976, 785, 378, 206, 333, 607, 603, 683, 264, 513, 534, 769, 915, 256, 754, 448, 178, 808, 8, 958, 745, 745, 626, 771, 661, 825, 796, 394, 724, 38, 867, 730, 609, 212, 531, 850, 665, 27, 56, 180, 322, 11, 795, 375, 868, 319, 477, 681, 174, 962, 20, 823, 436, 499, 638, 816, 876, 45, 794, 234, 849, 634, 600, 408, 779, 955, 22, 439, 155, 679, 638, 187, 860, 560, 882, 369, 317, 186, 952, 0, 893, 90, 359, 4, 130, 515, 796, 334, 190, 501, 990, 17, 391, 935, 523, 992, 215, 977, 434, 322, 97, 349, 580, 430, 591, 79, 231, 650, 98, 464, 181, 658, 354, 198, 764, 866, 440, 795, 72, 153, 690, 520, 763, 515, 195, 39, 871, 782, 492, 184, 127, 188, 557, 494, 375, 167, 317, 921, 739, 385, 699, 355, 649, 750, 83, 849, 913, 850, 810, 317, 741, 11, 573, 674, 425, 293, 816, 548, 747, 177, 290, 75, 723, 33, 748, 797, 618, 323, 696, 920, 915, 788, 537, 510, 351, 631, 422, 187, 602, 789, 128, 629, 151, 621, 708, 683, 530, 176, 88, 986, 392, 391, 784, 32, 693, 561, 282, 27, 564, 331, 812, 798, 858, 239, 278, 970, 983, 292, 896, 882, 456, 972, 366, 14, 761, 152, 639, 443, 944, 117, 73, 929, 44, 193, 186, 915, 310, 39, 36, 935, 272, 195, 807, 561, 600, 811, 80, 607, 147, 200, 186, 649, 676, 76, 86, 283, 847, 740, 573, 671, 750, 615, 881, 609, 969, 73, 938, 968, 216, 144, 793, 827, 178, 229, 160, 737, 506, 713, 619, 509, 23, 422, 236, 73, 954, 710, 647, 740, 668, 767, 971, 940, 763, 573, 722, 997, 652, 8, 525, 762, 549, 761, 770, 440, 608, 784, 997, 696, 448, 72, 98, 889, 278, 898, 477, 216, 703, 159, 856, 957, 670, 933, 121, 339, 127, 439, 145, 525, 453, 384, 529, 695, 952, 134, 478, 12, 793, 932, 288, 829, 259, 35, 724, 842, 661, 43, 473, 87, 745, 630, 127, 585, 923, 456, 953, 665, 862, 581, 370, 78, 504, 513, 612, 749, 424, 512, 367, 953, 53, 678, 642, 975, 939, 104, 781, 259, 386, 838, 654, 43, 562, 776, 798, 494, 54, 50, 536, 950, 441, 860, 544, 886, 563, 592, 656, 459, 148, 816, 910, 208, 949, 816, 694, 189, 831, 998, 690, 826, 590, 217, 695, 522, 373, 878, 71, 75, 889, 681, 191, 817, 671, 280, 439, 677, 49, 456, 395, 747, 529, 127, 600, 400, 623, 541, 978, 14, 461, 790, 94, 957, 577, 212, 189, 928, 372, 227, 440, 424, 534, 946, 224, 801, 936, 102, 462, 860, 127, 93, 364, 747, 239, 972, 205, 416, 30, 652, 55, 770, 768, 799, 751, 476, 315, 801, 832, 624, 400, 386, 363, 988, 519, 311, 899, 241, 575, 128, 77, 881, 740, 645, 78, 97, 498, 930, 801, 607, 102, 972, 343, 584, 428, 982, 595, 634, 717, 48, 557, 936, 311, 803, 415, 55, 178, 856, 444, 992, 469, 705, 265, 646, 712, 526, 546, 479, 958, 593, 387, 622, 816, 12, 5, 915, 882, 216, 237, 372, 788, 842, 318, 676, 471, 609, 806, 905, 39, 640, 595, 931, 884, 564, 239, 988, 683, 563, 393, 284, 481, 605, 753, 373, 125, 115, 850, 94, 818, 787, 364, 151, 45, 303, 309, 129, 517, 266, 148, 261, 609, 219, 395, 51, 600, 800, 814, 355, 779, 189, 118, 617, 126, 52, 819, 62, 394, 899, 907, 347, 103, 246, 477, 957, 199, 881, 270, 844, 910, 122, 54, 385, 670, 641, 570, 383, 725, 539, 156, 143, 394, 897, 857, 202, 913, 41, 252, 214, 816, 635, 962, 290, 234, 242, 478, 101, 474, 967, 249, 176, 670, 441, 836, 353, 653, 285, 396, 16, 130, 924, 324, 876};
		//int[] nums = {3,2,1};
		long ansNum = ans.minimumValueAfterDispel(nums);
		System.out.println(ansNum);
	}
}
