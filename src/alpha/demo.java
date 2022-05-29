package alpha;

import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.*;

public class demo {
	private static Logger log = LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		log.debug("at debug");
		log.error("at error");
		log.fatal("at fatal");
		log.info("at info");
		log.info("newly added");
		log.info("newly added 2 ");
		log.info("newly added 3 ");
		log.info("architech design develop branch 1");
		log.info("architech design develop branch 2");
	}

}
