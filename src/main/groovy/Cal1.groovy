import net.fortuna.ical4j.data.CalendarBuilder
import net.fortuna.ical4j.model.Component
import net.fortuna.ical4j.model.property.DateProperty
import net.fortuna.ical4j.model.property.Description
import net.fortuna.ical4j.model.property.Summary
import groovy.text.SimpleTemplateEngine

def upload = {
	def f = new File('/tmp/lala.ics')
	if(f) {
		def fis = new FileInputStream(f);
		CalendarBuilder builder = new CalendarBuilder();
		def calendar = builder.build(fis);
		for (Iterator i = calendar.getComponents().iterator(); i.hasNext();) {
			Component component = (Component) i.next();
			Date startS = ((DateProperty)component.getProperty("DTSTART")).getDate();
			startS = startS.previous().next()
			start = startS.format('yyyy-MM-dd 00:00:00.0')
			Date endS = ((DateProperty)component.getProperty("DTEND")).getDate();
			endS = endS.previous()
			end = endS.format('yyyy-MM-dd 00:00:00.0')
			String title = ((Summary)component.getProperty("SUMMARY")).getValue().trim();
			String comments = ((Description)component.getProperty("DESCRIPTION")).getValue().trim();
			println "insert into event_costs (version,driver_tip,hotel_cost,last_update_date,last_update_user_id,traveling_cost) values (0,0,0,now(),1,0);"
			println "insert into event (version,city,comments,cost,costs_id,date_from,date_to,last_update_date,last_update_user_id,max_attendants,mountain_info,snowing_center,title) values  (0,NULL,'${comments}', 0,LAST_INSERT_ID(),'${start}', '${end}', now(),1,0,NULL,NULL, '${title}');"
		}
	}
}

upload()
