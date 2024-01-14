package ru.nms.embeddingslibrary.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.curator.x.discovery.ServiceInstance;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.util.List;
import java.util.TreeMap;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonRootName("master")
public class MasterServiceMeta {

    private String id;

    private String name;

    private List<ServiceInstance<WorkerServiceMeta>> currentWorkers;

    private TreeMap<Integer, VirtualNodeMeta> ring;
}