package ru.nms.embeddingslibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonRootName("virtual")
public class VirtualNodeMeta {

    private List<WorkerServiceMeta> owners;

    int hash;

}
