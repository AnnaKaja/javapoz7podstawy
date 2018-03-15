package Films;

import java.util.*;

public class MoviesService {
    private List<Actor> actors;
    private List<Movies> movies;
    private Map<Movies, List<Actor>> filmRoles;

    public MoviesService() {
        this(new ArrayList<>(), new ArrayList<>());
    }

    public MoviesService(List<Actor> actors, List<Movies> movies) {
        this(actors, movies, new HashMap<>());
    }

    public MoviesService(List<Actor> actors, List<Movies> movies, Map<Movies, List<Actor>> filmRoles) {
        this.actors = actors;
        this.movies = movies;
        this.filmRoles = filmRoles;
    }

    public List<Actor> findActors() {
        return new ArrayList<>(actors);
    }

    public List<Movies> findMovies(Actor actor) {
        List<Movies> tmpMovies = new ArrayList<>();
        Set<Map.Entry<Movies, List<Actor>>> entries = filmRoles.entrySet();
        for (Map.Entry<Movies, List<Actor>> entry : entries) {
            List<Actor>actorsInMap = entry.getValue();
            if (actorsInMap.contains(actor)){
                tmpMovies.add(entry.getKey());
            }
        }
        return tmpMovies;
}

    public List<Movies> findMovies() {
        return new ArrayList<>(movies);
    }

    public Actor findActors(int actorId) {
        return actors.get(actorId);

    }
}