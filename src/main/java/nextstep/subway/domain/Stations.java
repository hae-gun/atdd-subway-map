package nextstep.subway.domain;

import lombok.EqualsAndHashCode;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Embeddable
@EqualsAndHashCode
public class Stations {

    private static final int INDEX_UP_STATION = 0;
    private static final int INDEX_DOWN_STATION = 1;

    @OneToMany(mappedBy = "section", fetch = FetchType.LAZY)
    private List<Station> values = new ArrayList<>();

    protected Stations() {
    }

    public Stations(List<Station> stations) {
        this.values.addAll(stations);
    }

    public List<Station> toList() {
        return this.values;
    }
}
