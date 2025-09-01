def solution(genres, plays):
    genre_album = {}
    genre_song = {}
    
    for i in range(len(genres)):
        k = genres[i]
        if k in genre_album:
            genre_album[k] += plays[i]
            genre_song[k].append((i, plays[i]))
        else:
            genre_album[k] = plays[i]
            genre_song[k] = [(i, plays[i])]
    
    genre_album = dict(sorted(genre_album.items(), key=lambda x: x[1], reverse=True))
    
    answer = []
    for g in genre_album:
        genre_songs = sorted(genre_song[g], key=lambda x: (-x[1], x[0]))
        if len(genre_songs) == 1:
            answer.append(genre_songs[0][0])
        else:
            for i in range(2):
                answer.append(genre_songs[i][0])
        
    return answer