package chapter7_lambdasAndStreams.item48_parallelStreams;

public class UseCautionWhenMakingStreamsParallel {

    //parallelizing a pipeline is unlikely to increase its performance if the source is from Stream.iterate, or the intermediate operation limit is used

    //Do not parallelize stream pipelines indiscriminately

    //performance gains from parallelism are best on streams over ArrayList, HashMap, HashSet, and ConcurrentHashMap instances; arrays; int ranges; and long ranges
    //spliterator

    //The nature of a stream pipeline’s terminal operation also affects the effectiveness of parallel execution
    //best
    //  reductions - min, max, count, and sum
    //  short-circuiting operations anyMatch, allMatch, and noneMatch
    //worst
    //  mutable reductions -  collect method
}

