package ru.nms.embeddingslibrary.model;

import lombok.*;

@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Embedding {

    private int id;

    private int embeddingSize;

    @ToString.Exclude
    private float[][] embedding;

}
