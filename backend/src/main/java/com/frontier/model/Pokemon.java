package com.frontier.model;

// Imports
import org.springframework.data.mongodb.core.mapping.Document;
import com.frontier.enums.PokemonType;
import com.frontier.enums.Stat;
import com.frontier.model.base.BaseEntity;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

// Annotations
@Data
@EqualsAndHashCode(callSuper=true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pokemon")

// Class
public class Pokemon extends BaseEntity {

    // Attributes
    private Integer dex;
    private Integer[] stats;
    private List<PokemonType> type;
    private List<String> abilities;

    public int getStat(Stat stat) {
        return stats[stat.index()];
    }

    public void setStat(Stat stat, int value) {
        stats[stat.index()] = value;
    }

}
