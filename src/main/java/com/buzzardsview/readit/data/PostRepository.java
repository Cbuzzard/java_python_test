package com.buzzardsview.readit.data;

import com.buzzardsview.readit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Integer> {
}
