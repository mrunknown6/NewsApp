package com.example.newsapp.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.newsapp.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: Article)

    @Delete
    suspend fun delete(item: Article)

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>
}