package ru.nms.embeddingslibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName("worker")
public class WorkerServiceMeta {

    private String name;

    private List<Integer> virtualNodeHashes;

    private String address;

    private int port;

}
