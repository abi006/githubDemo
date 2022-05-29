package beta;

import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.*;

public class demo1 {
	private static Logger log = LogManager.getLogger(demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("at debug");
		log.error("at error");
		log.fatal("at fatal");
		log.info("at info");
		log.info("newly added");
		log.info("newly added 2 ");
		log.info("newly added 3 ");

		System.out.println("archi 2 full chnages");
		System.out.println("archi 2 full chnages 2 ");
	}

}
