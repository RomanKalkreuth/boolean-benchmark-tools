## Boolean Benchmark Tools for GBFS

This repository contains a reader and evaluator for the benchmarks of the General Boolean Function Benchmark Suite (GBFS). GBFS provides a benchmark that can be used to evaluate the search performance and robustness of heuristic methods in logic synthesis. The corresponding paper has been presented at the 17th ACM/SIGEVO Conference on Foundations of Genetic Algorithms (FOGA'23) last year.

## Usage

### Benchmark Reader 

```python
from benchmark_reader import BenchmarkReader
reader = BenchmarkReader()
reader.read_plu_file("../benchmarks/plu/mux6.plu")
reader.benchmark.print_header()
reader.benchmark.print()
```

### Benchmark Evalutor 
```python
from benchmark_evaluator import BenchmarkEvaluator
evaluator = BenchmarkEvaluator()
evaluator.evaluate(x, y, compressed = True/False, chunk_size = NBITS) 
```

## Reference

> Kalkreuth et al.: General Boolean Function Benchmark Suite,
> FOGA'23: Proceedings of the 17th ACM/SIGEVO Conference on Foundations of Genetic Algorithms,
> DOI: 10.1145/3594805.3607131.
> URL: https://doi.org/10.1145/3594805.3607131,

BibTex:

```

@inproceedings{DBLP:conf/foga/KalkreuthVHVYB23,
  author       = {Roman Kalkreuth and
                  Zdenek Vas{\'{\i}}cek and
                  Jakub Husa and
                  Diederick Vermetten and
                  Furong Ye and
                  Thomas B{\"{a}}ck},
  title        = {General Boolean Function Benchmark Suite},
  booktitle    = {Proceedings of the 17th {ACM/SIGEVO} Conference on Foundations of
                  Genetic Algorithms, {FOGA} 2023, Potsdam, Germany, 30 August 2023
                  - 1 September 2023},
  pages        = {84--95},
  publisher    = {{ACM}},
  year         = {2023},
  url          = {https://doi.org/10.1145/3594805.3607131},
  doi          = {10.1145/3594805.3607131},
  timestamp    = {Sat, 05 Aug 2023 00:01:53 +0200},
  biburl       = {https://dblp.org/rec/conf/foga/KalkreuthVHVYB23.bib},
  bibsource    = {dblp computer science bibliography, https://dblp.org}
}
