package cn.wen.oa.global;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 张文军
 * @Description:常量类
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/920:59
 */
public class Contant {

		public static final String POST_STAFF = "员工";
		public static final String POST_FM = "部门经理";
		public static final String POST_GM = "总经理";
		public static final String POST_CASHIER = "财务";

		/**
		 * 职务集合
		 * @return
		 */
		public static List<String> getPost(){
				ArrayList<String> list = new ArrayList<>();
				list.add(POST_STAFF);
				list.add(POST_FM);
				list.add(POST_GM);
				list.add(POST_CASHIER);
				return list;
		}

		/**
		 * 费用类别
		 * @return
		 */
		public static List<String> getItem(){
				ArrayList<String> list = new ArrayList<>();
				list.add("住宿");
				list.add("交通");
				list.add("办公");
				list.add("餐饮");
				return list;
		}

		/**
		 * 报销单状态
		 */

		public static final String CLAIMVOUCHER_CREATED="新创建";
		public static final String CLAIMVOUCHER_SUBMIT="已提交";
		public static final String CLAIMVOUCHER_APPROVED="已审核";
		public static final String CLAIMVOUCHER_BACK="已打回";
		public static final String CLAIMVOUCHER_TERMINATED="已终止";
		public static final String CLAIMVOUCHER_RECHECK="待复审";
		public static final String CLAIMVOUCHER_PAID="已打款";

		/**
		 *审核额度
		 */
		public static final double LIMIT_CHECK=5000.00;

		/**
		 * 处理方式
		 */
		public static final String DEAL_CREATE="创建";
		public static final String DEAL_SUBMIT="提交";
		public static final String DEAL_UPDATE="修改";
		public static final String DEAL_BACK="打回";
		public static final String DEAL_REJECT="拒绝";
		public static final String DEAL_PASS="通过";
		public static final String DEAL_PAID="打款";

}
