package ru.nms.embeddingslibrary.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.curator.x.discovery.ServiceInstance;

import java.util.List;
import java.util.TreeMap;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MasterUpdateDto {

    private List<ServiceInstance<WorkerServiceMeta>> currentWorkers;

    private TreeMap<Integer, VirtualNodeMeta> ring;
}
