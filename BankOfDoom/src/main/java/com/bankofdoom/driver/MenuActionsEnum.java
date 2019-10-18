package com.bankofdoom.driver;

public enum MenuActionsEnum {

	// Actions for the bank machine menu



		// menu option to exit the program

		EXIT("exit"),

		// menu option to deposit funds

		DEPOSIT("deposit"),

		// menu option to withdraw funds

		WITHDRAW("withdraw"),

		// menu option to get account balance

		BALANCE("balance"),

		// savings account

		SAVINGS("savings"),

		// checking account

		CHECKING("checking"),

		// option for ok or enter

		OK("ok"),

		// clear entry

		CLEAR("clear"),

		// cancel transaction but don't exit

		CANCEL("cancel"),

		// transaction is complete and new customer

		ENDTRANS("end"),

		// transaction is complete and same customer

		NEXTTRANS("next");

		

		//String value for Enum

		private final String value;



		/**

		 * 

		 */

		public String toString() {

			return value;

		}

		/**

		 * 

		 * @param value

		 */

		private MenuActionsEnum(String value) {

			this.value=value;

		}



		/**

		 * Getter method for menu options

		 * @param option the string passed in from the user

		 * @return which option the user wanted

		 */

		public static MenuActionsEnum getMenuOption(String option) {

			switch (option) {

			case "exit":

				return EXIT;

			case "deposit":

				return DEPOSIT;

			case "withdraw":

				return WITHDRAW;

			case "balance":

				return BALANCE;

			case "savings":

				return SAVINGS;

			case "checking":

				return CHECKING;

			case "ok":

				return OK;

			case "clear":

				return CLEAR;

			case "cancel":

				return CANCEL;

			case "end":

				return ENDTRANS;

			case "next":

				return NEXTTRANS;

				default:

			}

			return null;

				

				

			}
}
