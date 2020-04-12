import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MapAdapter extends AbstractMap {
	private Map map;

	public MapAdapter(Object[][] array) {
		super();
		map = new HashMap();
		for (Object[] mapping : array) {
			map.put(mapping[0], mapping[1]);
		}

	}

	@Override
	public Set entrySet() {
		return map.entrySet();
	}

	}
