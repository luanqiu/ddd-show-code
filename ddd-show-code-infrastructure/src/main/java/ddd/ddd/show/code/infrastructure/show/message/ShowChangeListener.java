package ddd.ddd.show.code.infrastructure.show.message;

import org.ddd.base.domain.EventListenerI;
import ddd.ddd.show.code.domain.core.event.ShowChangeEvent;
import org.springframework.stereotype.Component;

/**
 * ShowChangeListener
 * date May 18, 2019 5:33:57 PM
 */
@Component
public class ShowChangeListener implements EventListenerI<ShowChangeEvent> {

  @Override
  public void execute(ShowChangeEvent event) {

  }

}
